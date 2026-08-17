package p226ma;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p119ga.d;
import p119ga.l;
import p119ga.q;
import p119ga.r;
import p262oa.b;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
final class a extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f49187b = new C0583a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f49188a;

    /* JADX INFO: renamed from: ma.a$a, reason: collision with other inner class name */
    class C0583a implements r {
        C0583a() {
        }

        @Override // p119ga.r
        public q b(d dVar, p244na.a aVar) {
            if (aVar.c() == Date.class) {
                return new a(null);
            }
            return null;
        }
    }

    private a() {
        this.f49188a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* synthetic */ a(C0583a c0583a) {
        this();
    }

    @Override // p119ga.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(p262oa.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.s() == b.NULL) {
            aVar.o();
            return null;
        }
        String strJ2 = aVar.j2();
        try {
            synchronized (this) {
                date = this.f49188a.parse(strJ2);
            }
            return new Date(date.getTime());
        } catch (ParseException e10) {
            throw new l("Failed parsing '" + strJ2 + "' as SQL Date; at path " + aVar.f(), e10);
        }
    }

    @Override // p119ga.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.r();
            return;
        }
        synchronized (this) {
            str = this.f49188a.format((java.util.Date) date);
        }
        cVar.U(str);
    }
}
