package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.AbstractC3941c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileWalkDirection f48302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f48303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f48304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f48305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48306f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractC3941c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f48307c;

        private final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f48309b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f48310c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f48311d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f48312e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f48313f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f48313f = bVar;
            }

            @Override // kotlin.io.i.c
            public File b() {
                if (!this.f48312e && this.f48310c == null) {
                    Function1 function1 = i.this.f48303c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f48310c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = i.this.f48305e;
                        if (function2 != null) {
                            function2.invoke(a(), new kotlin.io.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f48312e = true;
                    }
                }
                File[] fileArr = this.f48310c;
                if (fileArr != null) {
                    int i10 = this.f48311d;
                    Intrinsics.c(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f48310c;
                        Intrinsics.c(fileArr2);
                        int i11 = this.f48311d;
                        this.f48311d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f48309b) {
                    this.f48309b = true;
                    return a();
                }
                Function1 function3 = i.this.f48304d;
                if (function3 != null) {
                    function3.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: kotlin.io.i$b$b, reason: collision with other inner class name */
        private final class C0567b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f48314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f48315c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0567b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f48315c = bVar;
            }

            @Override // kotlin.io.i.c
            public File b() {
                if (this.f48314b) {
                    return null;
                }
                this.f48314b = true;
                return a();
            }
        }

        private final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f48316b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private File[] f48317c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f48318d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f48319e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f48319e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.i.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f48316b
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.i$b r0 = r9.f48319e
                    kotlin.io.i r0 = kotlin.io.i.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.i.d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f48316b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f48317c
                    if (r0 == 0) goto L47
                    int r2 = r9.f48318d
                    kotlin.jvm.internal.Intrinsics.c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.i$b r0 = r9.f48319e
                    kotlin.io.i r0 = kotlin.io.i.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.i.f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f48317c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f48317c = r0
                    if (r0 != 0) goto L76
                    kotlin.io.i$b r0 = r9.f48319e
                    kotlin.io.i r0 = kotlin.io.i.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.i.e(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    kotlin.io.a r3 = new kotlin.io.a
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f48317c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.Intrinsics.c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    kotlin.io.i$b r0 = r9.f48319e
                    kotlin.io.i r0 = kotlin.io.i.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.i.f(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f48317c
                    kotlin.jvm.internal.Intrinsics.c(r0)
                    int r1 = r9.f48318d
                    int r2 = r1 + 1
                    r9.f48318d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.i.b.c.b():java.io.File");
            }
        }

        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48320a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f48320a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f48307c = arrayDeque;
            if (i.this.f48301a.isDirectory()) {
                arrayDeque.push(f(i.this.f48301a));
            } else if (i.this.f48301a.isFile()) {
                arrayDeque.push(new C0567b(this, i.this.f48301a));
            } else {
                b();
            }
        }

        private final a f(File file) {
            int i10 = d.f48320a[i.this.f48302b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new Ad.n();
        }

        private final File g() {
            while (true) {
                c cVar = (c) this.f48307c.peek();
                if (cVar == null) {
                    return null;
                }
                File fileB = cVar.b();
                if (fileB == null) {
                    this.f48307c.pop();
                } else {
                    if (Intrinsics.b(fileB, cVar.a()) || !fileB.isDirectory() || this.f48307c.size() >= i.this.f48306f) {
                        return fileB;
                    }
                    this.f48307c.push(f(fileB));
                }
            }
        }

        @Override // kotlin.collections.AbstractC3941c
        protected void a() {
            File fileG = g();
            if (fileG != null) {
                c(fileG);
            } else {
                b();
            }
        }
    }

    private static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f48321a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f48321a = root;
        }

        public final File a() {
            return this.f48321a;
        }

        public abstract File b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    private i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10) {
        this.f48301a = file;
        this.f48302b = fileWalkDirection;
        this.f48303c = function1;
        this.f48304d = function2;
        this.f48305e = function3;
        this.f48306f = i10;
    }

    /* synthetic */ i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    public final i h(Function2 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new i(this.f48301a, this.f48302b, this.f48303c, this.f48304d, function, this.f48306f);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new b();
    }
}
