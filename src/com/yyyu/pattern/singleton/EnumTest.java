package com.yyyu.pattern.singleton;

/**
 * 功能：枚举测试
 *
 *
 * 参考：
 * http://www.jianshu.com/p/6f2f5627c27d
 *
 * @author yu
 * @date 2017/8/8.
 */
public class EnumTest {


    public static void main(String[] args) {
        ErrorCode errorCode = ErrorCode.ERROR_A;
        errorCode.sayHello();
        switch (errorCode) {
            case OK:
                System.out.print("OK==="+errorCode.getDescription());
                break;
            case ERROR_A:
                System.out.print("ERROR_A==="+errorCode.getDescription());
                break;
            case ERROR_B:
                System.out.print("ERROR_B==="+errorCode.getDescription());
                break;
        }
    }

    enum ErrorCode implements ISayHello{
        //每个枚举类型相当于一个实例
        OK(200) {
            @Override
            public String getDescription() {
                return "请求成功";
            }
        },
        ERROR_A(404) {
            @Override
            public String getDescription() {
                return "请求失败，找不到资源！";
            }
        },
        ERROR_B(500) {
            @Override
            public String getDescription() {
                return "请求失败，内部错误！";
            }
        };
        //在枚举中定义属性值
        private int mCode;
        //定义构造方法
        ErrorCode(int code) {
            this.mCode = code;
        }
        //抽象方法
        public abstract String getDescription();

        @Override
        public void sayHello() {
            System.out.println("枚举类型是可以实现接口的");
        }
    }

    interface ISayHello{
        void sayHello();
    }

}
