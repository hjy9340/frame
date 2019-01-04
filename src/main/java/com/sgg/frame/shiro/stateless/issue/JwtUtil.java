package com.sgg.frame.shiro.stateless.issue;

import cn.hutool.core.util.StrUtil;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.shiro.codec.Hex;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.List;

public class JwtUtil {
    private final static String SECRET_KEY = "*(-=4eklfasdfarerf41585fdasf";
    public static String issueJwt(String id, String subject, String issuer, Long period, List roles
            , List permissions, SignatureAlgorithm algorithm) {
        long currentTimeMillis = System.currentTimeMillis();// 当前时间戳
        byte[] secretKeyBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);// 秘钥
        JwtBuilder jwt  =  Jwts.builder();
        if(StrUtil.isNotBlank(id)) jwt.setId(id);
        jwt.setSubject(subject);// 用户名主题
        if(StrUtil.isNotBlank(issuer)) jwt.setIssuer(issuer);//签发者
        jwt.setIssuedAt(new Date(currentTimeMillis));//签发时间
        if(null != period){
            Date expiration = new Date(currentTimeMillis+period);
            jwt.setExpiration(expiration);//有效时间
        }
        if(roles!=null) jwt.claim("roles", roles);//角色
        if(permissions!=null) jwt.claim("perms", permissions);//权限
        jwt.compressWith(CompressionCodecs.DEFLATE);//压缩，可选GZIP
        jwt.signWith(algorithm, secretKeyBytes);//加密设置
        return jwt.compact();
    }
    public static String hmacDigest(String data){
        String checksum=null;
        try{
            Mac mac=Mac.getInstance("HmacMD5");
            byte[] secretByte=SECRET_KEY.getBytes("utf-8");
            byte[] dataBytes=data.getBytes("utf-8");
            SecretKey secretKey=new SecretKeySpec(secretByte,"HmacMD5");
            mac.init(secretKey);
            byte[] doFinal=mac.doFinal(dataBytes);
            char[] hexB=new Hex().encode(doFinal);
            checksum=new String(hexB);
        }catch (Exception e){
            e.printStackTrace();
        }
        return checksum;
    }
}
