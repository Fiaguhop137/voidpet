package Xf;

import Vf.j;

/* JADX INFO: loaded from: classes3.dex */
abstract class i {

    private static class a implements Vf.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Vf.d f16521c;

        public a(int i10, String str, Vf.d dVar) {
            this.f16519a = i10;
            this.f16520b = str;
            this.f16521c = dVar;
        }

        @Override // Vf.c
        public String a() {
            return this.f16520b;
        }
    }

    private static class b implements Vf.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Vf.d f16525d;

        public b(int i10, int i11, String str, Vf.d dVar) {
            this.f16522a = i10;
            this.f16523b = i11;
            this.f16524c = str;
            this.f16525d = dVar;
        }

        @Override // Vf.c
        public String a() {
            return this.f16524c;
        }
    }

    static Vf.c a(j jVar, int i10, Vf.d dVar) {
        return new b(jVar.d() * 4, i10, jVar.c(), dVar);
    }

    static Vf.c b(j jVar, Vf.d dVar) {
        return new a(jVar.d() * 4, jVar.c(), dVar);
    }
}
