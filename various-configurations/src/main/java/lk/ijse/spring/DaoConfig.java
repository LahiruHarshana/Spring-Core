package lk.ijse.spring;

import lk.ijse.spring.dao.DAOSpringBean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DaoConfig {

    public DAOSpringBean daoSpringBean() {
        return new DAOSpringBean();
    }
}
