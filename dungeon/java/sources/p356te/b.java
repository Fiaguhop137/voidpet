package p356te;

import Fe.f;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p015ae.h0;
import p176je.I;
import p338se.x;

/* JADX INFO: loaded from: classes3.dex */
public class b implements x.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f54702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f54703k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f54704a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54705b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54706c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f54707d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f54708e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f54709f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f54710g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p356te.a.EnumC0679a f54711h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f54712i = null;

    /* JADX INFO: renamed from: te.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0681b implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f54713a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // se.x.b
        public void a() {
            g((String[]) this.f54713a.toArray(new String[0]));
        }

        @Override // se.x.b
        public void b(f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        @Override // se.x.b
        public void c(p464ze.b bVar, p464ze.f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // se.x.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f54713a.add((String) obj);
            }
        }

        @Override // se.x.b
        public x.a e(p464ze.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        protected abstract void g(String[] strArr);
    }

    private class c implements x.a {

        class a extends AbstractC0681b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // p356te.b.AbstractC0681b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f54708e = strArr;
            }
        }

        /* JADX INFO: renamed from: te.b$c$b, reason: collision with other inner class name */
        class C0682b extends AbstractC0681b {
            C0682b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // p356te.b.AbstractC0681b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f54709f = strArr;
            }
        }

        private c() {
        }

        /* synthetic */ c(b bVar, a aVar) {
            this();
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0682b();
        }

        @Override // se.x.a
        public void a() {
        }

        @Override // se.x.a
        public void b(p464ze.f fVar, p464ze.b bVar, p464ze.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // se.x.a
        public void c(p464ze.f fVar, f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // se.x.a
        public void d(p464ze.f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strG = fVar.g();
            if ("k".equals(strG)) {
                if (obj instanceof Integer) {
                    b.this.f54711h = p356te.a.EnumC0679a.h(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strG)) {
                if (obj instanceof int[]) {
                    b.this.f54704a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strG)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    b.this.f54705b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strG)) {
                if (obj instanceof Integer) {
                    b.this.f54706c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strG) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                b.this.f54707d = str2;
            }
        }

        @Override // se.x.a
        public x.a e(p464ze.f fVar, p464ze.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // se.x.a
        public x.b f(p464ze.f fVar) {
            String strG = fVar != null ? fVar.g() : null;
            if ("d1".equals(strG)) {
                return h();
            }
            if ("d2".equals(strG)) {
                return i();
            }
            return null;
        }
    }

    private class d implements x.a {

        class a extends AbstractC0681b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // p356te.b.AbstractC0681b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f54712i = strArr;
            }
        }

        private d() {
        }

        /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        @Override // se.x.a
        public void a() {
        }

        @Override // se.x.a
        public void b(p464ze.f fVar, p464ze.b bVar, p464ze.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // se.x.a
        public void c(p464ze.f fVar, f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // se.x.a
        public void d(p464ze.f fVar, Object obj) {
        }

        @Override // se.x.a
        public x.a e(p464ze.f fVar, p464ze.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // se.x.a
        public x.b f(p464ze.f fVar) {
            if ("b".equals(fVar != null ? fVar.g() : null)) {
                return h();
            }
            return null;
        }
    }

    private class e implements x.a {

        class a extends AbstractC0681b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // p356te.b.AbstractC0681b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f54708e = strArr;
            }
        }

        /* JADX INFO: renamed from: te.b$e$b, reason: collision with other inner class name */
        class C0683b extends AbstractC0681b {
            C0683b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // p356te.b.AbstractC0681b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f54709f = strArr;
            }
        }

        private e() {
        }

        /* synthetic */ e(b bVar, a aVar) {
            this();
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private x.b h() {
            return new a();
        }

        private x.b i() {
            return new C0683b();
        }

        @Override // se.x.a
        public void a() {
        }

        @Override // se.x.a
        public void b(p464ze.f fVar, p464ze.b bVar, p464ze.f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // se.x.a
        public void c(p464ze.f fVar, f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // se.x.a
        public void d(p464ze.f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String strG = fVar.g();
            if ("version".equals(strG)) {
                if (obj instanceof int[]) {
                    b.this.f54704a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strG)) {
                b.this.f54705b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // se.x.a
        public x.a e(p464ze.f fVar, p464ze.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // se.x.a
        public x.b f(p464ze.f fVar) {
            String strG = fVar != null ? fVar.g() : null;
            if ("data".equals(strG) || "filePartClassNames".equals(strG)) {
                return h();
            }
            if ("strings".equals(strG)) {
                return i();
            }
            return null;
        }
    }

    static {
        try {
            f54702j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f54702j = false;
        }
        HashMap map = new HashMap();
        f54703k = map;
        map.put(p464ze.b.k(new p464ze.c("kotlin.jvm.internal.KotlinClass")), p356te.a.EnumC0679a.CLASS);
        map.put(p464ze.b.k(new p464ze.c("kotlin.jvm.internal.KotlinFileFacade")), p356te.a.EnumC0679a.FILE_FACADE);
        map.put(p464ze.b.k(new p464ze.c("kotlin.jvm.internal.KotlinMultifileClass")), p356te.a.EnumC0679a.MULTIFILE_CLASS);
        map.put(p464ze.b.k(new p464ze.c("kotlin.jvm.internal.KotlinMultifileClassPart")), p356te.a.EnumC0679a.MULTIFILE_CLASS_PART);
        map.put(p464ze.b.k(new p464ze.c("kotlin.jvm.internal.KotlinSyntheticClass")), p356te.a.EnumC0679a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        p356te.a.EnumC0679a enumC0679a = this.f54711h;
        return enumC0679a == p356te.a.EnumC0679a.CLASS || enumC0679a == p356te.a.EnumC0679a.FILE_FACADE || enumC0679a == p356te.a.EnumC0679a.MULTIFILE_CLASS_PART;
    }

    @Override // se.x.c
    public void a() {
    }

    @Override // se.x.c
    public x.a b(p464ze.b bVar, h0 h0Var) {
        p356te.a.EnumC0679a enumC0679a;
        if (bVar == null) {
            d(0);
        }
        if (h0Var == null) {
            d(1);
        }
        p464ze.c cVarA = bVar.a();
        if (cVarA.equals(I.f47232a)) {
            return new c(this, null);
        }
        if (cVarA.equals(I.f47251t)) {
            return new d(this, null);
        }
        if (f54702j || this.f54711h != null || (enumC0679a = (p356te.a.EnumC0679a) f54703k.get(bVar)) == null) {
            return null;
        }
        this.f54711h = enumC0679a;
        return new e(this, null);
    }

    public p356te.a m(p410we.c cVar) {
        if (this.f54711h == null || this.f54704a == null) {
            return null;
        }
        p410we.c cVar2 = new p410we.c(this.f54704a, (this.f54706c & 8) != 0);
        if (!cVar2.h(cVar)) {
            this.f54710g = this.f54708e;
            this.f54708e = null;
        } else if (o() && this.f54708e == null) {
            return null;
        }
        String[] strArr = this.f54712i;
        return new p356te.a(this.f54711h, cVar2, this.f54708e, this.f54710g, this.f54709f, this.f54705b, this.f54706c, this.f54707d, strArr != null ? p446ye.a.e(strArr) : null);
    }

    public p356te.a n() {
        return m(p410we.c.f56902i);
    }
}
