package p226ma;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p119ga.d;
import p119ga.l;
import p119ga.q;
import p119ga.r;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f49189b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f49190a;

    class a implements r {
        a() {
        }

        @Override // p119ga.r
        public q b(d dVar, p244na.a aVar) {
            if (aVar.c() == Time.class) {
                return new b(null);
            }
            return null;
        }
    }

    private b() {
        this.f49190a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // p119ga.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(p262oa.a aVar) throws IOException {
        Time time;
        if (aVar.s() == p262oa.b.NULL) {
            aVar.o();
            return null;
        }
        String strJ2 = aVar.j2();
        try {
            synchronized (this) {
                time = new Time(this.f49190a.parse(strJ2).getTime());
            }
            return time;
        } catch (ParseException e10) {
            throw new l("Failed parsing '" + strJ2 + "' as SQL Time; at path " + aVar.f(), e10);
        }
    }

    @Override // p119ga.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.r();
            return;
        }
        synchronized (this) {
            str = this.f49190a.format((Date) time);
        }
        cVar.U(str);
    }
}
