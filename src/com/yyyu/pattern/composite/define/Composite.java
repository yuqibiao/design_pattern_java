package com.yyyu.pattern.composite.define;


import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象：通常需要存储子对象
 */
public class Composite extends Component {
    List<Component> componentList = new ArrayList<Component>();
    @Override
    public void someOperation() {
        for (int i = 0; i <componentList.size() ; i++) {
            System.out.println(""+getChild(i));
        }
    }
    @Override
    public void addChild(Component child) {
        componentList.add(child);
    }
    @Override
    public void removeChild(Component child) {
        componentList.remove(child);
    }
    @Override
    public Component getChild(int index) {
        return componentList.get(index);
    }
}
