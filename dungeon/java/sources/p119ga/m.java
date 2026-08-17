package p119ga;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f42284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f42285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f42286c;

    final enum a extends m {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    final enum b extends m {
        b(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f42284a = aVar;
        b bVar = new b("STRING", 1);
        f42285b = bVar;
        f42286c = new m[]{aVar, bVar};
    }

    private m(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ m(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f42286c.clone();
    }
}
