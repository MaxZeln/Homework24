package ru.learnup.homework24;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.homework24.dao.*;
import ru.learnup.homework24.entity.Author;

@SpringBootApplication
@Slf4j
public class Homework24Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Homework24Application.class, args);

        SpringDataAuthorDao authorDao = context.getBean(SpringDataAuthorDao.class);
        SpringDataBook_WarehouseDao book_warehouseDao = context.getBean(SpringDataBook_WarehouseDao.class);
        SpringDataBookDao bookDao = context.getBean(SpringDataBookDao.class);
        SpringDataBuyerDao buyerDao = context.getBean(SpringDataBuyerDao.class);
        SpringDataOrderDao orderDao = context.getBean(SpringDataOrderDao.class);


        log.info("Author: {}", authorDao.findById(34));
        log.info("Author: {}", authorDao.findAll());

//        log.info("Book_Warehouse: {}", book_warehouseDao.findById(1));
//        log.info("Book_Warehouse: {}", book_warehouseDao.findAll());

        log.info("Book: {}", bookDao.findById(50));
        log.info("Book: {}", bookDao.findAll());

        log.info("Buyer: {}", buyerDao.findById(25) );
        log.info("Buyer: {}", buyerDao.findAll() );

//        log.info("Order: {}", orderDao.findById(1));
//        log.info("Author: {}", orderDao.findAll());

    }

}
