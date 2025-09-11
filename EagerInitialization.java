<bean id="alien" class="org.example.Alien"/>
<bean id="laptop" class="org.example.Laptop"/>
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//Both Alien and Laptop objects are created immediately, even before you call getBean()

