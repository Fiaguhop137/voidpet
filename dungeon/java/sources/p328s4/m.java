package p328s4;

import L4.l;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class m implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f53287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f53288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f53289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f53290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f53291h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f53292a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f53293b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f53294c = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53295a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f53295a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53295a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53295a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53295a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f53296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f53298c;

        public b(c cVar) {
            this.f53296a = cVar;
        }

        @Override // p328s4.l
        public void a() {
            this.f53296a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f53297b = i10;
            this.f53298c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f53297b == bVar.f53297b && l.e(this.f53298c, bVar.f53298c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f53297b * 31;
            Bitmap.Config config = this.f53298c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f53297b, this.f53298c);
        }
    }

    static class c extends p328s4.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p328s4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f53287d = configArr;
        f53288e = configArr;
        f53289f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f53290g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f53291h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f53292a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num != null && num.intValue() <= i10 * 8) {
                if (num.intValue() == i10 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f53292a.c(bVarE);
                return this.f53292a.e(num.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f53288e;
        }
        int i10 = a.f53295a[config.ordinal()];
        if (i10 == 1) {
            return f53287d;
        }
        if (i10 == 2) {
            return f53289f;
        }
        if (i10 != 3) {
            return i10 != 4 ? new Bitmap.Config[]{config} : f53291h;
        }
        return f53290g;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f53294c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f53294c.put(config, treeMap);
        return treeMap;
    }

    @Override // p328s4.k
    public String a(Bitmap bitmap) {
        return h(l.i(bitmap), bitmap.getConfig());
    }

    @Override // p328s4.k
    public String b(int i10, int i11, Bitmap.Config config) {
        return h(l.h(i10, i11, config), config);
    }

    @Override // p328s4.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f53292a.e(l.i(bitmap), bitmap.getConfig());
        this.f53293b.d(bVarE, bitmap);
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f53297b));
        navigableMapJ.put(Integer.valueOf(bVarE.f53297b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p328s4.k
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(l.h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f53293b.a(bVarG);
        if (bitmap != null) {
            f(Integer.valueOf(bVarG.f53297b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // p328s4.k
    public int e(Bitmap bitmap) {
        return l.i(bitmap);
    }

    @Override // p328s4.k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f53293b.f();
        if (bitmap != null) {
            f(Integer.valueOf(l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f53293b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f53294c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f53294c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
