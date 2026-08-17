package p119ga;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements p119ga.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f42239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f42240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f42241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f42242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f42243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f42244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ b[] f42245h;

    final enum a extends b {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return field.getName();
        }
    }

    /* JADX INFO: renamed from: ga.b$b, reason: collision with other inner class name */
    final enum C0484b extends b {
        C0484b(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return b.h(field.getName());
        }
    }

    final enum c extends b {
        c(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return b.h(b.g(field.getName(), ' '));
        }
    }

    final enum d extends b {
        d(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return b.g(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }

    final enum e extends b {
        e(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return b.g(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }

    final enum f extends b {
        f(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return b.g(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }

    final enum g extends b {
        g(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.c
        public String e(Field field) {
            return b.g(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f42238a = aVar;
        C0484b c0484b = new C0484b("UPPER_CAMEL_CASE", 1);
        f42239b = c0484b;
        c cVar = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        f42240c = cVar;
        d dVar = new d("UPPER_CASE_WITH_UNDERSCORES", 3);
        f42241d = dVar;
        e eVar = new e("LOWER_CASE_WITH_UNDERSCORES", 4);
        f42242e = eVar;
        f fVar = new f("LOWER_CASE_WITH_DASHES", 5);
        f42243f = fVar;
        g gVar = new g("LOWER_CASE_WITH_DOTS", 6);
        f42244g = gVar;
        f42245h = new b[]{aVar, c0484b, cVar, dVar, eVar, fVar, gVar};
    }

    private b(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }

    static String g(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    static String h(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f42245h.clone();
    }
}
