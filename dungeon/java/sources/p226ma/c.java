package p226ma;

import java.sql.Timestamp;
import java.util.Date;
import p119ga.d;
import p119ga.q;
import p119ga.r;

/* JADX INFO: loaded from: classes2.dex */
class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f49191b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f49192a;

    class a implements r {
        a() {
        }

        @Override // p119ga.r
        public q b(d dVar, p244na.a aVar) {
            if (aVar.c() == Timestamp.class) {
                return new c(dVar.l(Date.class), null);
            }
            return null;
        }
    }

    private c(q qVar) {
        this.f49192a = qVar;
    }

    /* synthetic */ c(q qVar, a aVar) {
        this(qVar);
    }

    @Override // p119ga.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(p262oa.a aVar) {
        Date date = (Date) this.f49192a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p119ga.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(p262oa.c cVar, Timestamp timestamp) {
        this.f49192a.d(cVar, timestamp);
    }
}
