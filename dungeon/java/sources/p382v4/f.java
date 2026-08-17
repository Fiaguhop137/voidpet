package p382v4;

import A4.i;
import A4.l;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f56188b;

    private static final class a implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56189a;

        a(Context context) {
            this.f56189a = context;
        }

        @Override // v4.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new f(this.f56189a, this);
        }

        @Override // p382v4.o
        public void e() {
        }

        @Override // v4.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // v4.f.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    private static final class b implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56190a;

        b(Context context) {
            this.f56190a = context;
        }

        @Override // v4.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new f(this.f56190a, this);
        }

        @Override // p382v4.o
        public void e() {
        }

        @Override // v4.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }

        @Override // v4.f.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return i.a(this.f56190a, i10, theme);
        }
    }

    private static final class c implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56191a;

        c(Context context) {
            this.f56191a = context;
        }

        @Override // v4.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new f(this.f56191a, this);
        }

        @Override // p382v4.o
        public void e() {
        }

        @Override // v4.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // v4.f.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f56192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f56193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f56194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f56195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f56196e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f56192a = theme;
            this.f56193b = resources;
            this.f56194c = eVar;
            this.f56195d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56194c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f56196e;
            if (obj != null) {
                try {
                    this.f56194c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return p274p4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, com.bumptech.glide.load.data.d.a aVar) {
            try {
                Object objC = this.f56194c.c(this.f56192a, this.f56193b, this.f56195d);
                this.f56196e = objC;
                aVar.f(objC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f56187a = context.getApplicationContext();
        this.f56188b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i10, int i11, p274p4.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(l.f217b);
        return new n.a(new K4.c(num), new d(theme, theme != null ? theme.getResources() : this.f56187a.getResources(), this.f56188b, num.intValue()));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
