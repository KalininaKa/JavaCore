package org.ООП.инкапсуляция;

/*В примере рассмотрен один из принципов ООП — инкапсуляция.
Поле name класса Student сокрыто от внешнего кода. Для доступа к этому
полю определены методы getName() и setName(String name).*/
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
