package dev.chiba.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class AppFactory<T>{

    private final Map<String,Class<? extends T>> types = new HashMap<>();

    public void registerType(Class<? extends T> type,String key){
        types.computeIfAbsent(key,t -> type);
    }

    public T getInstance(String key) {
        try{
            Constructor<? extends T> constructor = types.get(key).getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        }
        catch (Exception exception){
            throw new AppFactoryException(exception.getMessage());
        }
    }

}
