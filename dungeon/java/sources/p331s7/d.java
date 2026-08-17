package p331s7;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p349t7.i;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Set f53448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final c.b f53449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c.a f53450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f53451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f53452e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f53453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f53454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f53455c;

        a(Context context, String str, String str2, c.InterfaceC0650c interfaceC0650c) {
            this.f53453a = context;
            this.f53454b = str;
            this.f53455c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                s7.d r1 = p331s7.d.this     // Catch: p331s7.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f53453a     // Catch: p331s7.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f53454b     // Catch: p331s7.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f53455c     // Catch: p331s7.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                p331s7.d.a(r1, r2, r3, r4)     // Catch: p331s7.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s7.d.a.run():void");
        }
    }

    class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f53457a;

        b(String str) {
            this.f53457a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f53457a);
        }
    }

    protected d() {
        this(new e(), new p331s7.a());
    }

    protected d(c.b bVar, c.a aVar) {
        this.f53448a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f53449b = bVar;
        this.f53450c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) throws Throwable {
        d dVar;
        Context context2;
        i iVar;
        if (this.f53448a.contains(str) && !this.f53451d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f53449b.a(str);
            this.f53448a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f53451d) {
                if (this.f53451d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                dVar = this;
                context2 = context;
                this.f53450c.a(context2, this.f53449b.d(), this.f53449b.b(str), fileD, dVar);
            } else {
                dVar = this;
                context2 = context;
            }
            try {
                if (dVar.f53452e) {
                    try {
                        iVar = new i(fileD);
                        try {
                            List listC = iVar.c();
                            iVar.close();
                            Iterator it = listC.iterator();
                            while (it.hasNext()) {
                                e(context2, dVar.f53449b.c((String) it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (iVar == null) {
                                throw th2;
                            }
                            iVar.close();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            dVar.f53449b.e(fileD.getAbsolutePath());
            dVar.f53448a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f53449b.b(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f53451d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String strB = this.f53449b.b(str);
        if (f.a(str2)) {
            return new File(c(context), strB);
        }
        return new File(c(context), strB + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0650c interfaceC0650c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0650c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0650c)).start();
        }
    }

    public void h(String str) {
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    public d j() {
        this.f53452e = true;
        return this;
    }
}
