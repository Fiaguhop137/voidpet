package Ob;

import Rb.u;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: Ob.a$a, reason: collision with other inner class name */
    class C0144a implements p173jb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f8540a;

        C0144a(u uVar) {
            this.f8540a = uVar;
        }

        @Override // p173jb.d
        public void reject(String str, String str2, Throwable th) {
            this.f8540a.reject(str, str2, th);
        }

        @Override // p173jb.d
        public void resolve(Object obj) {
            this.f8540a.resolve(obj);
        }
    }

    class b implements p173jb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f8541a;

        b(u uVar) {
            this.f8541a = uVar;
        }

        @Override // p173jb.d
        public void reject(String str, String str2, Throwable th) {
            this.f8541a.reject(str, str2, th);
        }

        @Override // p173jb.d
        public void resolve(Object obj) {
            this.f8541a.resolve(obj);
        }
    }

    static void a(a aVar, p173jb.d dVar, String... strArr) {
        if (aVar == null) {
            dVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            aVar.i(dVar, strArr);
        }
    }

    static void c(a aVar, u uVar, String... strArr) {
        a(aVar, new C0144a(uVar), strArr);
    }

    static void j(a aVar, u uVar, String... strArr) {
        k(aVar, new b(uVar), strArr);
    }

    static void k(a aVar, p173jb.d dVar, String... strArr) {
        if (aVar == null) {
            dVar.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            aVar.g(dVar, strArr);
        }
    }

    void b(c cVar, String... strArr);

    void e(c cVar, String... strArr);

    void g(p173jb.d dVar, String... strArr);

    void i(p173jb.d dVar, String... strArr);
}
