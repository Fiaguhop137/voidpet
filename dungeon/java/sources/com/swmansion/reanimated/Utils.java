package com.swmansion.reanimated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static boolean isChromeDebugger = false;

    /* JADX INFO: renamed from: com.swmansion.reanimated.Utils$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Runnable[] val$runnables;

        AnonymousClass1(Runnable[] runnableArr) {
            this.val$runnables = runnableArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Runnable runnable : this.val$runnables) {
                runnable.run();
            }
        }
    }

    public static Runnable combineRunnables(Runnable... runnableArr) {
        return new AnonymousClass1(runnableArr);
    }

    public static float convertToFloat(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Double) {
            return ((Double) obj).floatValue();
        }
        return 0.0f;
    }

    public static int[] processIntArray(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = readableArray.getInt(i10);
        }
        return iArr;
    }

    public static Map<String, Integer> processMapping(ReadableMap readableMap) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, Integer.valueOf(readableMap.getInt(strNextKey)));
        }
        return map;
    }

    public static String simplifyStringNumbersList(String str) {
        return str.replace(",", "").replace("[", "").replace("]", "");
    }
}
