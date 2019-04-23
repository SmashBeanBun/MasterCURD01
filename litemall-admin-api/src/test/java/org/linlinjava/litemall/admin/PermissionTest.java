package org.linlinjava.litemall.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.linlinjava.litemall.admin.util.PermVo;
import org.linlinjava.litemall.admin.util.Permission;
import org.linlinjava.litemall.admin.util.PermissionUtil;
import org.linlinjava.litemall.db.dao.LitemallSystemMapper;
import org.linlinjava.litemall.db.domain.LitemallSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PermissionTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private LitemallSystemMapper litemallSystemMapper;

    @Test
    public void test() {

        LitemallSystem litemallSystem=new LitemallSystem();
        litemallSystem.setKeyName("litemall_sign_type");
        litemallSystem.setKeyValue("0");
        System.out.println(litemallSystemMapper.updateByKeyName(litemallSystem));
//        String keyName="litemall_sign_type";
//        LitemallSystem litemallSystem1= litemallSystemMapper.selectByKeyName(keyName);
//        System.out.println(litemallSystem1.getKeyValue());
//        final String basicPackage = "org.linlinjava.litemall.admin";
//        List<Permission> permissionList = PermissionUtil.listPermission(context, basicPackage);
//        List<PermVo> permVoList = PermissionUtil.listPermVo(permissionList);
//        permVoList.stream().forEach(System.out::println);
    }
}
