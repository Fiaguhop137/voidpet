package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2358b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f32302a;

    static {
        char[] cArr = new char[80];
        f32302a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(Z0 z10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(z10, sb2, 0);
        return sb2.toString();
    }

    static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC2394n1.a(new C2393n0(((String) obj).getBytes(G0.f32217b))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2402q0) {
            sb2.append(": \"");
            sb2.append(AbstractC2394n1.a((AbstractC2402q0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C0) {
            sb2.append(" {");
            d((C0) obj, sb2, i10 + 2);
            sb2.append("\n");
            c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        c(i10, sb2);
        sb2.append("}");
    }

    private static void c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f32302a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void d(Z0 z10, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = z10.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), C0.h(method2, z10, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), C0.h(method, z10, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objH = C0.h(method4, z10, new Object[0]);
                    if (method5 == null) {
                        if (objH instanceof Boolean) {
                            if (((Boolean) objH).booleanValue()) {
                                b(sb2, i10, strSubstring, objH);
                            }
                        } else if (objH instanceof Integer) {
                            if (((Integer) objH).intValue() != 0) {
                                b(sb2, i10, strSubstring, objH);
                            }
                        } else if (objH instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objH).floatValue()) != 0) {
                                b(sb2, i10, strSubstring, objH);
                            }
                        } else if (!(objH instanceof Double)) {
                            if (objH instanceof String) {
                                zEquals = objH.equals("");
                            } else if (objH instanceof AbstractC2402q0) {
                                zEquals = objH.equals(AbstractC2402q0.f32443b);
                            } else if (objH instanceof Z0) {
                                if (objH != ((Z0) objH).b()) {
                                    b(sb2, i10, strSubstring, objH);
                                }
                            } else if (!(objH instanceof Enum) || ((Enum) objH).ordinal() != 0) {
                                b(sb2, i10, strSubstring, objH);
                            }
                            if (!zEquals) {
                                b(sb2, i10, strSubstring, objH);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objH).doubleValue()) != 0) {
                            b(sb2, i10, strSubstring, objH);
                        }
                    } else if (((Boolean) C0.h(method5, z10, new Object[0])).booleanValue()) {
                        b(sb2, i10, strSubstring, objH);
                    }
                }
            }
            i11 = 3;
        }
        C2405r1 c2405r1 = ((C0) z10).zzc;
        if (c2405r1 != null) {
            c2405r1.g(sb2, i10);
        }
    }
}
