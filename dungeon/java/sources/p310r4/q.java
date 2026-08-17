package p310r4;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f52344g = new StackTraceElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f52345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f52346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p274p4.a f52347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class f52348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f52349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f52350f;

    private static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f52351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52352b = true;

        a(Appendable appendable) {
            this.f52351a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f52352b) {
                this.f52352b = false;
                this.f52351a.append("  ");
            }
            this.f52352b = c10 == '\n';
            this.f52351a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f52352b) {
                this.f52352b = false;
                this.f52351a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f52352b = z10;
            this.f52351a.append(charSequenceA, i10, i11);
            return this;
        }
    }

    public q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public q(String str, List list) {
        this.f52349e = str;
        setStackTrace(f52344g);
        this.f52345a = list;
    }

    private void a(Throwable th, List list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator it = ((q) th).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f52345a;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List listF = f();
        int size = listF.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) listF.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f52349e);
        sb2.append(this.f52348d != null ? ", " + this.f52348d : "");
        sb2.append(this.f52347c != null ? ", " + this.f52347c : "");
        sb2.append(this.f52346b != null ? ", " + this.f52346b : "");
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb2.toString();
        }
        if (listF.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listF.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : listF) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void i(f fVar, p274p4.a aVar) {
        j(fVar, aVar, null);
    }

    void j(f fVar, p274p4.a aVar, Class cls) {
        this.f52346b = fVar;
        this.f52347c = aVar;
        this.f52348d = cls;
    }

    public void k(Exception exc) {
        this.f52350f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }
}
