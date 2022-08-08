package Adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName FileProperties
 * @description: 适配器类，适配了Properties，不用修改原油已经测试好的类（Properties）
 * @author: mzy
 * @create: 2022-08-04 23:53
 * @Version 1.0
 **/
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        super.load(new FileInputStream(this.getClass().getResource("").getPath() + filename) );
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        super.store(new FileOutputStream(this.getClass().getResource("").getPath() + filename), "");
    }

    @Override
    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return super.getProperty(key);
    }
}
