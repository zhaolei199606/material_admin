import com.alibaba.fastjson.JSON;
import com.zhaolei.material.admin.dao.graduation.UserMapper;
import com.zhaolei.material.admin.domain.dao.OrganizationDO;
import com.zhaolei.material.admin.domain.dao.UserDO;
import com.zhaolei.material.admin.domain.vo.MaterialVO;
import com.zhaolei.material.admin.service.MaterialService;
import com.zhaolei.material.admin.service.OrganizationService;
import com.zhaolei.material.admin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyDescriptor;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations={"classpath*:/spring/application.xml"}) //加载配置文件
public class AdminTest {
    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MaterialService materialService;

    @Test
    public void test1(){
        MaterialVO materialVO = new MaterialVO();
        materialVO.setLendNum(10);
        materialVO.setMaterialName("桌子");
        materialVO.setTotalNum(20);
        materialVO.setPrincipalStNum("222016333210145");
        System.out.println(JSON.toJSONString(materialVO));
    }
}
