package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static z f20154d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f20156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f20157c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f20158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f20159b;

        a() {
        }
    }

    z(Context context, LocationManager locationManager) {
        this.f20155a = context;
        this.f20156b = locationManager;
    }

    static z a(Context context) {
        if (f20154d == null) {
            Context applicationContext = context.getApplicationContext();
            f20154d = new z(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f20154d;
    }

    private Location b() {
        Location locationC = Z0.f.b(this.f20155a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = Z0.f.b(this.f20155a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f20156b.isProviderEnabled(str)) {
                return this.f20156b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f20157c.f20159b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f20157c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        y yVarB = y.b();
        yVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        yVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = yVarB.f20153c == 1;
        long j11 = yVarB.f20152b;
        long j12 = yVarB.f20151a;
        yVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = yVarB.f20152b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f20158a = z10;
        aVar.f20159b = j10;
    }

    boolean d() {
        a aVar = this.f20157c;
        if (e()) {
            return aVar.f20158a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f20158a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
