package br.usjt.desvmob.geodata.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;

import br.usjt.desvmob.geodata.R;

/**
 * Kevin Araujo Mestrinel
 * 816118639
 */
public class Util {
    public static Drawable getDrawable(Context context, String nome){

        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nome);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
