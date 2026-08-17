package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f20163f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f20165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f20166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f20167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f20168e;

    public d(Context context, int i10) {
        super(context);
        this.f20164a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f20165b = theme;
    }

    private Resources b() {
        if (this.f20168e == null) {
            Configuration configuration = this.f20167d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f20168e = super.getResources();
            } else {
                this.f20168e = createConfigurationContext(this.f20167d).getResources();
            }
        }
        return this.f20168e;
    }

    private void d() {
        boolean z10 = this.f20165b == null;
        if (z10) {
            this.f20165b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f20165b.setTo(theme);
            }
        }
        f(this.f20165b, this.f20164a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f20163f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f20163f = configuration2;
        }
        return configuration.equals(f20163f);
    }

    public void a(Configuration configuration) {
        if (this.f20168e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f20167d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f20167d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f20164a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f20166c == null) {
            this.f20166c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f20166c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f20165b;
        if (theme != null) {
            return theme;
        }
        if (this.f20164a == 0) {
            this.f20164a = p144i.i.f43246d;
        }
        d();
        return this.f20165b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f20164a != i10) {
            this.f20164a = i10;
            d();
        }
    }
}
