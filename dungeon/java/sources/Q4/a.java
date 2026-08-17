package Q4;

import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a implements Q4.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f9374f = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f9375g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f9376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f9378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P4.a f9379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p042c5.a f9380e;

    /* JADX INFO: renamed from: Q4.a$a, reason: collision with other inner class name */
    private class C0156a implements U4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9381a;

        private C0156a() {
            this.f9381a = new ArrayList();
        }

        /* synthetic */ C0156a(a aVar, Q4.b bVar) {
            this();
        }

        @Override // U4.b
        public void a(File file) {
        }

        @Override // U4.b
        public void b(File file) {
            c cVarU = a.this.u(file);
            if (cVarU == null || cVarU.f9387a != ".cnt") {
                return;
            }
            this.f9381a.add(new b(cVarU.f9388b, file, null));
        }

        @Override // U4.b
        public void c(File file) {
        }

        public List d() {
            return Collections.unmodifiableList(this.f9381a);
        }
    }

    static class b implements Q4.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O4.b f9384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9386d;

        private b(String str, File file) {
            V4.k.g(file);
            this.f9383a = (String) V4.k.g(str);
            this.f9384b = O4.b.b(file);
            this.f9385c = -1L;
            this.f9386d = -1L;
        }

        /* synthetic */ b(String str, File file, Q4.b bVar) {
            this(str, file);
        }

        @Override // Q4.f.a
        public long a() {
            if (this.f9385c < 0) {
                this.f9385c = this.f9384b.size();
            }
            return this.f9385c;
        }

        @Override // Q4.f.a
        public long b() {
            if (this.f9386d < 0) {
                this.f9386d = this.f9384b.d().lastModified();
            }
            return this.f9386d;
        }

        public O4.b c() {
            return this.f9384b;
        }

        @Override // Q4.f.a
        public String getId() {
            return this.f9383a;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9388b;

        private c(String str, String str2) {
            this.f9387a = str;
            this.f9388b = str2;
        }

        /* synthetic */ c(String str, String str2, Q4.b bVar) {
            this(str, str2);
        }

        public static c b(File file) {
            String strS;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strS = a.s(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strS.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new c(strS, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f9388b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f9388b + this.f9387a;
        }

        public String toString() {
            return this.f9387a + "(" + this.f9388b + ")";
        }
    }

    private static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    class e implements Q4.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f9390b;

        public e(String str, File file) {
            this.f9389a = str;
            this.f9390b = file;
        }

        @Override // Q4.f.b
        public O4.a A(Object obj) {
            return a(obj, a.this.f9380e.now());
        }

        public O4.a a(Object obj, long j10) throws U4.c.d {
            P4.a.EnumC0147a enumC0147a;
            File fileQ = a.this.q(this.f9389a);
            try {
                U4.c.b(this.f9390b, fileQ);
                if (fileQ.exists()) {
                    fileQ.setLastModified(j10);
                }
                return O4.b.b(fileQ);
            } catch (U4.c.d e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    enumC0147a = P4.a.EnumC0147a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof U4.c.C0186c) {
                    enumC0147a = P4.a.EnumC0147a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else {
                    enumC0147a = cause instanceof FileNotFoundException ? P4.a.EnumC0147a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : P4.a.EnumC0147a.WRITE_RENAME_FILE_OTHER;
                }
                a.this.f9379d.a(enumC0147a, a.f9374f, "commit", e10);
                throw e10;
            }
        }

        @Override // Q4.f.b
        public boolean y() {
            return !this.f9390b.exists() || this.f9390b.delete();
        }

        @Override // Q4.f.b
        public void z(P4.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f9390b);
                try {
                    V4.c cVar = new V4.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long jA = cVar.a();
                    fileOutputStream.close();
                    if (this.f9390b.length() != jA) {
                        throw new d(jA, this.f9390b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                a.this.f9379d.a(P4.a.EnumC0147a.WRITE_UPDATE_FILE_NOT_FOUND, a.f9374f, "updateResource", e10);
                throw e10;
            }
        }
    }

    private class f implements U4.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9392a;

        private f() {
        }

        /* synthetic */ f(a aVar, Q4.b bVar) {
            this();
        }

        private boolean d(File file) {
            c cVarU = a.this.u(file);
            if (cVarU == null) {
                return false;
            }
            String str = cVarU.f9387a;
            if (str == ".tmp") {
                return e(file);
            }
            V4.k.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > a.this.f9380e.now() - a.f9375g;
        }

        @Override // U4.b
        public void a(File file) {
            if (!a.this.f9376a.equals(file) && !this.f9392a) {
                file.delete();
            }
            if (this.f9392a && file.equals(a.this.f9378c)) {
                this.f9392a = false;
            }
        }

        @Override // U4.b
        public void b(File file) {
            if (this.f9392a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // U4.b
        public void c(File file) {
            if (this.f9392a || !file.equals(a.this.f9378c)) {
                return;
            }
            this.f9392a = true;
        }
    }

    public a(File file, int i10, P4.a aVar) {
        V4.k.g(file);
        this.f9376a = file;
        this.f9377b = y(file, aVar);
        this.f9378c = new File(file, x(i10));
        this.f9379d = aVar;
        B();
        this.f9380e = p042c5.d.a();
    }

    private boolean A(String str, boolean z10) {
        File fileQ = q(str);
        boolean zExists = fileQ.exists();
        if (z10 && zExists) {
            fileQ.setLastModified(this.f9380e.now());
        }
        return zExists;
    }

    private void B() {
        if (this.f9376a.exists()) {
            if (this.f9378c.exists()) {
                return;
            } else {
                U4.a.b(this.f9376a);
            }
        }
        try {
            U4.c.a(this.f9378c);
        } catch (U4.c.a unused) {
            this.f9379d.a(P4.a.EnumC0147a.WRITE_CREATE_DIR, f9374f, "version directory could not be created: " + this.f9378c, null);
        }
    }

    private long p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String t(String str) {
        c cVar = new c(".cnt", str, null);
        return cVar.c(w(cVar.f9388b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c u(File file) {
        c cVarB = c.b(file);
        if (cVarB != null && v(cVarB.f9388b).equals(file.getParentFile())) {
            return cVarB;
        }
        return null;
    }

    private File v(String str) {
        return new File(w(str));
    }

    private String w(String str) {
        return this.f9378c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String x(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    private static boolean y(File file, P4.a aVar) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
                try {
                    return canonicalPath.contains(string);
                } catch (IOException e10) {
                    e = e10;
                    aVar.a(P4.a.EnumC0147a.OTHER, f9374f, "failed to read folder to check if external: " + canonicalPath, e);
                    return false;
                }
            } catch (IOException e11) {
                e = e11;
                canonicalPath = null;
            }
        } catch (Exception e12) {
            aVar.a(P4.a.EnumC0147a.OTHER, f9374f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    private void z(File file, String str) throws U4.c.a {
        try {
            U4.c.a(file);
        } catch (U4.c.a e10) {
            this.f9379d.a(P4.a.EnumC0147a.WRITE_CREATE_DIR, f9374f, str, e10);
            throw e10;
        }
    }

    @Override // Q4.f
    public void a() {
        U4.a.a(this.f9376a);
    }

    @Override // Q4.f
    public void b() {
        U4.a.c(this.f9376a, new f(this, null));
    }

    @Override // Q4.f
    public long c(Q4.f.a aVar) {
        return p(((b) aVar).c().d());
    }

    @Override // Q4.f
    public boolean d(String str, Object obj) {
        return A(str, true);
    }

    @Override // Q4.f
    public Q4.f.b e(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str, null);
        File fileV = v(cVar.f9388b);
        if (!fileV.exists()) {
            z(fileV, "insert");
        }
        try {
            return new e(str, cVar.a(fileV));
        } catch (IOException e10) {
            this.f9379d.a(P4.a.EnumC0147a.WRITE_CREATE_TEMPFILE, f9374f, "insert", e10);
            throw e10;
        }
    }

    @Override // Q4.f
    public boolean f(String str, Object obj) {
        return A(str, false);
    }

    @Override // Q4.f
    public O4.a g(String str, Object obj) {
        File fileQ = q(str);
        if (!fileQ.exists()) {
            return null;
        }
        fileQ.setLastModified(this.f9380e.now());
        return O4.b.c(fileQ);
    }

    @Override // Q4.f
    public boolean isExternal() {
        return this.f9377b;
    }

    File q(String str) {
        return new File(t(str));
    }

    @Override // Q4.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List h() {
        C0156a c0156a = new C0156a(this, null);
        U4.a.c(this.f9378c, c0156a);
        return c0156a.d();
    }

    @Override // Q4.f
    public long remove(String str) {
        return p(q(str));
    }
}
