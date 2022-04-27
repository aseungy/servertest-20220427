package edo.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import product.ProductController;
import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;


@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = UploadController.class) // =@ComponentScan(basePackages = {"upload"})
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@ComponentScan(basePackageClasses = ProductController.class)
@MapperScan(basePackageClasses = ProductDAO.class)
@MapperScan(basePackageClasses = MemberDAO.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	

}
