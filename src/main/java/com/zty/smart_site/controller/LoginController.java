package com.zty.smart_site.controller;

import com.zty.smart_site.entity.*;
import com.zty.smart_site.service.AdminStaffService;
import com.zty.smart_site.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Api(description = "登录接口")
@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {
    @Autowired
    private UserService userService;//用户

    @Autowired
    private AdminStaffService adminStaffService;//管理员工

    @ApiOperation(value = "PC登陆",notes = "测试数据:{\"username\":\"admin\",\"password\":\"123456\"}")
    @PostMapping("/LoginPc")
    public JsonResult LoginPc(@RequestBody Map map) throws ParseException {
        JsonResult jsonResult = new JsonResult(ResultCode.USER_NOT_EXIST);
        User user = userService.FindUserByUsername(map);//根据用户名查询用户信息
        if (user!=null){
            if (user.getPassword().equals(map.get("password"))){
                // 获取当前时间
                Date date = new Date();
                //如果想比较日期则写成"yyyy-MM-dd"就可以了
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                //将字符串形式的时间转化为Date类型的时间
                Date a=sdf.parse(user.getEnd_time());
                Date b= sdf.parse(sdf.format(date));
		if(a.getTime()-b.getTime()>=0) {
		    jsonResult.setData(user);
            jsonResult.setMessage("登录成功!");
            jsonResult.setCode(200);
            return jsonResult;
        }else {
            jsonResult.setMessage("账户已过期,请联系厂家!");
            jsonResult.setCode(20004);
            return jsonResult;

        }
            }else {
                jsonResult.setMessage("密码错误,登录失败!");
                jsonResult.setCode(20003);
                return jsonResult;
            }
        }else {
            jsonResult.setMessage("用户名不存在!");
            jsonResult.setCode(20001);
            return jsonResult;
        }
    }

    @ApiOperation(value = "App登录",notes = "测试数据:{\"admin_phone\":\"13000000000\",\n" +
            "\"password\":\"123456\"}")
    @PostMapping("/LoginApp")
    public JsonResult LoginApp(@RequestBody Map map){
        JsonResult jsonResult = new JsonResult(ResultCode.USER_NOT_EXIST);
        AdminStaff adminStaff = adminStaffService.FindAdminStaffByStaff_phone(map);
        if(adminStaff!=null){
            if (adminStaff.getPassword().equals(map.get("password"))){
                jsonResult.setMessage("登录成功!");
                jsonResult.setData(adminStaff);
                jsonResult.setCode(200);
                return jsonResult;
            }else {
                jsonResult.setMessage("密码错误,登录成功!");
                jsonResult.setCode(20003);
                return jsonResult;
            }
        }else {
            jsonResult.setMessage("用户不存在!");
            jsonResult.setCode(20001);
            return jsonResult;
        }
    }
}
