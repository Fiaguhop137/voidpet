package io.sentry.transport;

import io.sentry.C3771q2;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.EnumC3727k;
import io.sentry.H;
import io.sentry.InterfaceC3698e0;
import io.sentry.T2;
import io.sentry.util.C3799a;
import io.sentry.util.D;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f46546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3833z3 f46547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f46548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f46549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f46550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3799a f46551f;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.p();
        }
    }

    public interface b {
        void f(z zVar);
    }

    public z(o oVar, C3833z3 c3833z3) {
        this.f46548c = new ConcurrentHashMap();
        this.f46549d = new CopyOnWriteArrayList();
        this.f46550e = null;
        this.f46551f = new C3799a();
        this.f46546a = oVar;
        this.f46547b = c3833z3;
    }

    public z(C3833z3 c3833z3) {
        this(m.b(), c3833z3);
    }

    public static /* synthetic */ void c(z zVar, io.sentry.hints.f fVar) {
        zVar.getClass();
        fVar.e();
        zVar.f46547b.getLogger().c(EnumC3721i3.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    private void f(EnumC3727k enumC3727k, Date date) {
        Date date2 = (Date) this.f46548c.get(enumC3727k);
        if (date2 == null || date.after(date2)) {
            this.f46548c.put(enumC3727k, date);
            p();
            InterfaceC3698e0 interfaceC3698e0A = this.f46551f.a();
            try {
                if (this.f46550e == null) {
                    this.f46550e = new Timer(true);
                }
                this.f46550e.schedule(new a(), date);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC3698e0A != null) {
                    try {
                        interfaceC3698e0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private List h(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(EnumC3727k.Attachment);
            case "replay_video":
                return Collections.singletonList(EnumC3727k.Replay);
            case "profile_chunk":
                return Arrays.asList(EnumC3727k.ProfileChunkUi, EnumC3727k.ProfileChunk);
            case "profile":
                return Collections.singletonList(EnumC3727k.Profile);
            case "feedback":
                return Collections.singletonList(EnumC3727k.Feedback);
            case "log":
                return Collections.singletonList(EnumC3727k.LogItem);
            case "span":
                return Collections.singletonList(EnumC3727k.Span);
            case "event":
                return Collections.singletonList(EnumC3727k.Error);
            case "trace_metric":
                return Collections.singletonList(EnumC3727k.TraceMetric);
            case "check_in":
                return Collections.singletonList(EnumC3727k.Monitor);
            case "session":
                return Collections.singletonList(EnumC3727k.Session);
            case "transaction":
                return Collections.singletonList(EnumC3727k.Transaction);
            default:
                return Collections.singletonList(EnumC3727k.Unknown);
        }
    }

    private boolean m(String str) {
        Iterator it = h(str).iterator();
        while (it.hasNext()) {
            if (i((EnumC3727k) it.next())) {
                return true;
            }
        }
        return false;
    }

    private void o(H h10, boolean z10) {
        io.sentry.util.l.h(h10, io.sentry.hints.q.class, new w());
        io.sentry.util.l.h(h10, io.sentry.hints.l.class, new x(z10));
        io.sentry.util.l.h(h10, io.sentry.hints.f.class, new y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Iterator it = this.f46549d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f(this);
        }
    }

    private long r(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC3698e0 interfaceC3698e0A = this.f46551f.a();
        try {
            Timer timer = this.f46550e;
            if (timer != null) {
                timer.cancel();
                this.f46550e = null;
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            this.f46549d.clear();
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void e(b bVar) {
        this.f46549d.add(bVar);
    }

    public C3771q2 g(C3771q2 c3771q2, H h10) {
        ArrayList arrayList = null;
        for (T2 t10 : c3771q2.c()) {
            if (m(t10.O().e().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t10);
                this.f46547b.getClientReportRecorder().d(io.sentry.clientreport.f.RATELIMIT_BACKOFF, t10);
            }
        }
        if (arrayList == null) {
            return c3771q2;
        }
        this.f46547b.getLogger().c(EnumC3721i3.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (T2 t11 : c3771q2.c()) {
            if (!arrayList.contains(t11)) {
                arrayList2.add(t11);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C3771q2(c3771q2.b(), arrayList2);
        }
        this.f46547b.getLogger().c(EnumC3721i3.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        o(h10, false);
        return null;
    }

    public boolean i(EnumC3727k enumC3727k) {
        Date date;
        Date date2 = new Date(this.f46546a.a());
        Date date3 = (Date) this.f46548c.get(EnumC3727k.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC3727k.Unknown.equals(enumC3727k) || (date = (Date) this.f46548c.get(enumC3727k)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean k() {
        Date date = new Date(this.f46546a.a());
        Iterator it = this.f46548c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = (Date) this.f46548c.get((EnumC3727k) it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public void s(b bVar) {
        this.f46549d.remove(bVar);
    }

    public void t(String str, String str2, int i10) {
        if (str == null) {
            if (i10 == 429) {
                f(EnumC3727k.All, new Date(this.f46546a.a() + r(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] strArrSplit = str3.replace(" ", "").split(":", -1);
            if (strArrSplit.length > 0) {
                long jR = r(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.f46546a.a() + jR);
                    if (str4 == null || str4.isEmpty()) {
                        f(EnumC3727k.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            EnumC3727k enumC3727kValueOf = EnumC3727k.Unknown;
                            try {
                                String strB = D.b(str5);
                                if (strB != null) {
                                    enumC3727kValueOf = EnumC3727k.valueOf(strB);
                                } else {
                                    this.f46547b.getLogger().c(EnumC3721i3.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e10) {
                                this.f46547b.getLogger().a(EnumC3721i3.INFO, e10, "Unknown category: %s", str5);
                            }
                            if (!EnumC3727k.Unknown.equals(enumC3727kValueOf)) {
                                f(enumC3727kValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }
}
