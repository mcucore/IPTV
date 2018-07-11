package cn.com.pcalpha.iptv.model;

import java.io.Serializable;

import cn.com.pcalpha.iptv.constants.MenuCode;

/**
 * Created by caiyida on 2018/6/25.
 */

public class Menu implements Serializable {
    private MenuCode code;
    private String name;


    public Menu(MenuCode code, String name) {
        this.code = code;
        this.name = name;
    }

    public MenuCode getCode() {
        return code;
    }

    public void setCode(MenuCode code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
