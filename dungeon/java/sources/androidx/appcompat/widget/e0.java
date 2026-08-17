package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f20989c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f20990d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f20991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f20992b;

    private e0(Context context) {
        super(context);
        if (!r0.c()) {
            this.f20991a = new g0(this, context.getResources());
            this.f20992b = null;
            return;
        }
        r0 r0Var = new r0(this, context.getResources());
        this.f20991a = r0Var;
        Resources.Theme themeNewTheme = r0Var.newTheme();
        this.f20992b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof e0) || (context.getResources() instanceof g0) || (context.getResources() instanceof r0) || !r0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f20989c) {
            try {
                ArrayList arrayList = f20990d;
                if (arrayList == null) {
                    f20990d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f20990d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f20990d.remove(size);
                        }
                    }
                    for (int size2 = f20990d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f20990d.get(size2);
                        e0 e0Var = weakReference2 != null ? (e0) weakReference2.get() : null;
                        if (e0Var != null && e0Var.getBaseContext() == context) {
                            return e0Var;
                        }
                    }
                }
                e0 e0Var2 = new e0(context);
                f20990d.add(new WeakReference(e0Var2));
                return e0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f20991a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f20991a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f20992b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f20992b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
