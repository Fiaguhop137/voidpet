package io.sentry.util;

import io.sentry.C3711g3;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: renamed from: io.sentry.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3802d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f46567a = "sentry-debug-meta.properties";

    public static void a(C3833z3 c3833z3, List list) {
        if (list != null) {
            f(c3833z3, list);
            b(c3833z3, list);
            d(c3833z3, list);
        }
    }

    private static void b(C3833z3 c3833z3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String strG = g(properties);
            if (strG != null) {
                String strH = h(properties);
                if (strH == null) {
                    strH = "unknown";
                }
                c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Build tool found: %s, version %s", strG, strH);
                C3711g3.d().b(strG, strH);
                return;
            }
        }
    }

    private static void c(C3833z3 c3833z3, List list) {
        if (c3833z3.getBundleIds().isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        c3833z3.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void d(C3833z3 c3833z3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String strL = l(properties);
            String strM = m(properties);
            String strI = i(properties);
            String strJ = j(properties);
            String strK = k(properties);
            if (strL != null || strM != null || strI != null || strJ != null || strK != null) {
                C3833z3.g distribution = c3833z3.getDistribution();
                if (strL != null && !strL.isEmpty() && distribution.f46718b.isEmpty()) {
                    c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Distribution org slug found: %s", strL);
                    distribution.f46718b = strL;
                }
                if (strM != null && !strM.isEmpty() && distribution.f46719c.isEmpty()) {
                    c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Distribution project slug found: %s", strM);
                    distribution.f46719c = strM;
                }
                if (strI != null && !strI.isEmpty() && distribution.f46717a.isEmpty()) {
                    c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.f46717a = strI;
                }
                if (strJ != null && !strJ.isEmpty() && distribution.f46721e == null) {
                    c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Distribution build configuration found: %s", strJ);
                    distribution.f46721e = strJ;
                }
                if (strK == null || strK.isEmpty() || distribution.f46722f != null) {
                    return;
                }
                String[] strArrSplit = strK.split(",", -1);
                ArrayList arrayList = new ArrayList();
                for (String str : strArrSplit) {
                    String strTrim = str.trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Distribution install groups override found: %s", arrayList);
                distribution.f46722f = arrayList;
                return;
            }
        }
    }

    private static void e(C3833z3 c3833z3, List list) {
        if (c3833z3.getProguardUuid() == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strN = n((Properties) it.next());
                if (strN != null) {
                    c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Proguard UUID found: %s", strN);
                    c3833z3.setProguardUuid(strN);
                    return;
                }
            }
        }
    }

    public static void f(C3833z3 c3833z3, List list) {
        if (list != null) {
            c(c3833z3, list);
            e(c3833z3, list);
        }
    }

    public static String g(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String h(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    private static String i(Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    private static String j(Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    private static String k(Properties properties) {
        return properties.getProperty("io.sentry.distribution.install-groups-override");
    }

    private static String l(Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    private static String m(Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    public static String n(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
