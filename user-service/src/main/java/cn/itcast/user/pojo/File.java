package cn.itcast.user.pojo;

import lombok.Data;

@Data
public class File {
    private Integer id;

    private String path;

    private String name;

    private String type;
}