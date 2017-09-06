package com.lin.controller;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lin.domain.FormulaInfo;
import com.lin.service.ParasService;
import com.lin.util.PagedResult;

/**
 * 功能概要：UserController
 * @author chenhuan
 * @since  2017年7月10日 
 */
@Controller 
@RequestMapping("/user")
public class UserController extends BaseController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private ParasService  parasService;
	
	
	/**
	 *  显示山东效益指标的计算公式界面
	 *  @since 2017年7月10日 
	 * @return
	 */
	@RequestMapping("/bootstrapTest1")
	public String bootStrapTest1(){
		return "bootstrap/bootstrapTest1";
	}
	
    /**
     * 分页查询公式信息
     * @author chenhuan
     * @since  2015年10月23日 
     * @param page
     * @return
     */
    @RequestMapping(value="/list.do", method= RequestMethod.POST)
    @ResponseBody
    public String list(Integer pageNumber,Integer pageSize ,String userName) {
		logger.info("分页查询用户信息列表请求入参：pageNumber{},pageSize{}", pageNumber,pageSize);
		try {
			//PagedResult<User> pageResult = userService.queryByPage(userName, pageNumber,pageSize);
			PagedResult<FormulaInfo> pageResult = parasService.queryFormulaByPage(userName, pageNumber, pageSize);
    	    return responseSuccess(pageResult); //返回的是JSON对象
    	} catch (Exception e) {
			return responseFail(e.getMessage());
		}
    }
	
	

    

    

    

}
