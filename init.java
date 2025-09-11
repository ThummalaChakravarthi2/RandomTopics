<bean id="alien" class="org.example.Alien" lazy-init="true">
    <property name="age" value="21"/>
    <property name="com" ref="laptop"/>
</bean>

<bean id="laptop" class="org.example.Laptop"/>
//When the container starts → Alien bean is not created yet
//Only when you call context.getBean("alien") → Spring actually creates it
