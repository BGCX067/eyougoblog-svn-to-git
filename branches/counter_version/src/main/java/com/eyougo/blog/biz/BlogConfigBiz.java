package com.eyougo.blog.biz;

import java.util.List;

import com.eyougo.blog.base.exception.InternalException;
import com.eyougo.blog.entity.BlogConfig;

public interface BlogConfigBiz {
	/**
	 * 读取数据库中所有设置信息
	 */
	List<BlogConfig> getAllBlogConfigs();
	
	BlogConfig findBlogConfig(String id);
	
	String findBlogConfigValueById(String id);
	
	void saveBlogConfigs(List<BlogConfig> blogConfigList) throws InternalException;

	
	/**
	 * 将设置信息存入configList中
	 * @param id
	 * @param configValue
	 * @param configList
	 * @return BlogConfigBiz
	 * @throws EyougoBlogException
	 */
	BlogConfigBiz setBlogConfigValue(String id,String configValue,List<BlogConfig> configList);
	
	String getAdminPassword();
	
	String getBlogCopyright();
	
	String getBlogName();
	
	String getBlogTitle();
	
	String getOriginalNote();
}
