package com.jpadao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Demo;
/**
 * 
 * Title:DemoRepository
 * Description:操作demo类的接口
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月3日
 */
public interface DemoRepository extends JpaRepository<Demo, Long> {

}
