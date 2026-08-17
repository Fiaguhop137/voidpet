package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f20605a = {16842912};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f20606b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f20607c = new Rect();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f20608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f20609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f20610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f20611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f20612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f20613f;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f20609b = method;
                            f20610c = field;
                            f20611d = field2;
                            f20612e = field3;
                            f20613f = field4;
                            f20608a = true;
                            return;
                        }
                        f20609b = null;
                        f20610c = null;
                        f20611d = null;
                        f20612e = null;
                        f20613f = null;
                        f20608a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f20609b = method;
                            f20610c = field;
                            f20611d = field2;
                            f20612e = field3;
                            f20613f = field4;
                            f20608a = true;
                            return;
                        }
                        f20609b = null;
                        f20610c = null;
                        f20611d = null;
                        f20612e = null;
                        f20613f = null;
                        f20608a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f20609b = method;
                            f20610c = field;
                            f20611d = field2;
                            f20612e = field3;
                            f20613f = field4;
                            f20608a = true;
                            return;
                        }
                        f20609b = null;
                        f20610c = null;
                        f20611d = null;
                        f20612e = null;
                        f20613f = null;
                        f20608a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f20609b = method;
                        f20610c = field;
                        f20611d = field2;
                        f20612e = field3;
                        f20613f = field4;
                        f20608a = true;
                        return;
                    }
                    f20609b = null;
                    f20610c = null;
                    f20611d = null;
                    f20612e = null;
                    f20613f = null;
                    f20608a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f20609b = method;
                        f20610c = field;
                        f20611d = field2;
                        f20612e = field3;
                        f20613f = field4;
                        f20608a = true;
                        return;
                    }
                    f20609b = null;
                    f20610c = null;
                    f20611d = null;
                    f20612e = null;
                    f20613f = null;
                    f20608a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f20609b = method;
                        f20610c = field;
                        f20611d = field2;
                        f20612e = field3;
                        f20613f = field4;
                        f20608a = true;
                        return;
                    }
                    f20609b = null;
                    f20610c = null;
                    f20611d = null;
                    f20612e = null;
                    f20613f = null;
                    f20608a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f20609b = method;
                f20610c = field;
                f20611d = field2;
                f20612e = field3;
                f20613f = field4;
                f20608a = true;
                return;
            }
            f20609b = null;
            f20610c = null;
            f20611d = null;
            f20612e = null;
            f20613f = null;
            f20608a = false;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f20608a) {
                try {
                    Object objInvoke = f20609b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f20610c.getInt(objInvoke), f20611d.getInt(objInvoke), f20612e.getInt(objInvoke), f20613f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return O.f20607c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f20605a);
        } else {
            drawable.setState(f20606b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(p038c1.a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
