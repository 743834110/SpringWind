package com.baomidou.springwind.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.framework.controller.SuperController;
import com.baomidou.kisso.SSOConfig;
import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.SSOToken;
import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.kisso.annotation.Permission;
import com.baomidou.kisso.common.encrypt.SaltEncoder;
import com.baomidou.kisso.common.util.RandomUtil;
import com.baomidou.kisso.web.waf.request.WafRequestWrapper;
import com.baomidou.springwind.common.MyCaptcha;
import com.baomidou.springwind.common.enums.UserType;
import com.baomidou.springwind.entity.User;
import com.baomidou.springwind.service.IUserService;

/**
 * <p>
 * 账户相关操作
 * </p>
 * 
 * @author hubin
 * @Date 2016-04-13
 */
@Controller
@RequestMapping("/account")
public class AccountController extends SuperController {
	
	//锁定用户标记
	private static final String LOCKSCREEN_USER_FLAG = "LockscreenUserFlag";



	/**
	 * 登录
	 */
	@RequestMapping("/login")
	public String index(Model model) {


		return "index";
	}


}
