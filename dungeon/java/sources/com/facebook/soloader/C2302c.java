package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.soloader.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2302c extends G implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f31350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f31351g;

    /* JADX INFO: renamed from: com.facebook.soloader.c$a */
    protected class a extends G.e {
        protected a() {
        }

        @Override // com.facebook.soloader.G.e
        public G.c[] b() {
            ArrayList arrayList = new ArrayList();
            Iterator it = C2302c.this.f31350f.iterator();
            while (it.hasNext()) {
                G.e eVarQ = ((m) it.next()).q();
                try {
                    arrayList.addAll(Arrays.asList(eVarQ.b()));
                    eVarQ.close();
                } catch (Throwable th) {
                    if (eVarQ != null) {
                        try {
                            eVarQ.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return (G.c[]) arrayList.toArray(new G.c[arrayList.size()]);
        }

        @Override // com.facebook.soloader.G.e
        public void c(File file) throws IOException {
            Iterator it = C2302c.this.f31350f.iterator();
            while (it.hasNext()) {
                m.b bVar = (m.b) ((m) it.next()).q();
                try {
                    bVar.c(file);
                    bVar.close();
                } catch (Throwable th) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public C2302c(Context context, String str) {
        this(context, str, true);
    }

    public C2302c(Context context, String str, boolean z10) {
        super(context, str, z10);
        ArrayList arrayList = new ArrayList();
        this.f31350f = arrayList;
        this.f31351g = false;
        arrayList.add(new m(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$"));
        w(context, str);
    }

    private void w(Context context, String str) {
        if (context.getApplicationInfo().splitSourceDirs == null) {
            return;
        }
        try {
            for (String str2 : context.getApplicationInfo().splitSourceDirs) {
                m mVar = new m(context, str, new File(str2), "^lib/([^/]+)/([^/]+\\.so)$");
                if (mVar.v()) {
                    p.g("BackupSoSource", "adding backup source from split: " + mVar.toString());
                    this.f31350f.add(mVar);
                }
            }
        } catch (IOException e10) {
            p.h("BackupSoSource", "failed to read split apks", e10);
        }
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        C2302c c2302c = new C2302c(context, this.f31359a.getName());
        try {
            c2302c.e(0);
            return c2302c;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.soloader.C2305f, com.facebook.soloader.E
    public String c() {
        return "BackupSoSource";
    }

    @Override // com.facebook.soloader.C2305f, com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        if (this.f31351g) {
            return super.d(str, i10, threadPolicy);
        }
        return 0;
    }

    @Override // com.facebook.soloader.G, com.facebook.soloader.E
    public void e(int i10) throws IOException {
        if ((i10 & 8) != 0) {
            return;
        }
        super.e(i10);
        this.f31351g = true;
    }

    @Override // com.facebook.soloader.G
    protected byte[] n() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 3);
            parcelObtain.writeInt(SysUtil.g(this.f31322d));
            parcelObtain.writeInt(this.f31350f.size());
            Iterator it = this.f31350f.iterator();
            while (it.hasNext()) {
                parcelObtain.writeByteArray(((m) it.next()).n());
            }
            String str = this.f31322d.getApplicationInfo().sourceDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile = new File(str).getCanonicalFile();
            if (!canonicalFile.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.G
    public G.c[] o() {
        G.e eVarQ = ((m) this.f31350f.get(0)).q();
        try {
            G.c[] cVarArrB = eVarQ.b();
            eVarQ.close();
            return cVarArrB;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new a();
    }

    @Override // com.facebook.soloader.C2305f, com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f31359a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f31359a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f31360b + " apks = " + this.f31350f.toString() + "]";
    }

    public boolean x(String str, int i10) throws IOException {
        boolean z10;
        G.e eVarQ = q();
        try {
            G.c[] cVarArrB = eVarQ.b();
            int length = cVarArrB.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                if (cVarArrB[i11].f31329a.equals(str)) {
                    p.b("SoLoader", "Found " + str + " in " + c());
                    z10 = true;
                    break;
                }
                i11++;
            }
            eVarQ.close();
            if (!z10) {
                return false;
            }
            p.b("SoLoader", "Preparing " + c());
            e(i10);
            return true;
        } catch (Throwable th) {
            if (eVarQ != null) {
                try {
                    eVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
