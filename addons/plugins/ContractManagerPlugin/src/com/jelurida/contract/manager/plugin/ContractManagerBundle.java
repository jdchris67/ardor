package com.jelurida.contract.manager.plugin;

import com.intellij.CommonBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ResourceBundle;

/**
 * Based on org.jetbrains.plugins.groovy.GroovyBundle
 */
public class ContractManagerBundle {
    public static String message(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, @NotNull Object... params) {
        return CommonBundle.message(getBundle(), key, params);
    }

    private static Reference<ResourceBundle> ourBundle;
    @NonNls
    public static final String BUNDLE = "com.jelurida.contract.manager.plugin.ContractManagerBundle";

    private static ResourceBundle getBundle() {
        ResourceBundle bundle = com.intellij.reference.SoftReference.dereference(ourBundle);
        if (bundle == null) {
            bundle = ResourceBundle.getBundle(BUNDLE);
            ourBundle = new SoftReference<>(bundle);
        }
        return bundle;
    }
}