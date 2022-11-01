package cn.itcast.user.mapper;

import cn.itcast.user.pojo.File;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteByName(String name);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);

    int updateBatch(List<File> list);

    int batchInsert(@Param("list") List<File> list);
}