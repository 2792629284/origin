package com.repository;

import com.model.Userlogin;
import com.projection.UserloginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import java.util.List;

@RepositoryRestResource(path = "userloginwcc")
//@RepositoryRestResource(path = "userloginwcc",excerptProjection = UserloginInfo.class) //修改默认的样式为UserloginInfo投影
public interface UserloginRepository extends JpaRepository<Userlogin, Integer>, JpaSpecificationExecutor<Userlogin> {
//    @RestResource(exported = false)                //隐藏方法接口
//    Userlogin findByUsername(String username);

    UserloginInfo findByUsername(String username);


}