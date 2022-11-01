package cn.itcast.user.web;

import cn.itcast.user.mapper.FileMapper;
import cn.itcast.user.pojo.File;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author sxwh
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/file")
public class FileViewController {
    private final FileMapper fileMapper;

    @PostMapping("/insert")
    public void insert(@RequestBody File file) {
        fileMapper.insert(file);
    }

    @GetMapping("/delete/{name}")
    public void delete(@PathVariable("name") String name) {
        System.out.println("name:---->" + name);
        fileMapper.deleteByName(name);
    }
}
