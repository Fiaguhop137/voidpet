package expo.modules.updates.db;

import android.content.Context;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3311t0;
import p088ef.K;
import p122gd.j;
import p122gd.k;
import p122gd.l;
import p122gd.m;
import p183k3.p;
import p183k3.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/updates/db/UpdatesDatabase;", "Lk3/q;", "<init>", "()V", "Lhd/e;", "O", "()Lhd/e;", "Lhd/a;", "M", "()Lhd/a;", "Lhd/c;", "N", "()Lhd/c;", "p", "j", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UpdatesDatabase extends q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile UpdatesDatabase f41466q;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p201l3.a f41467r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p201l3.a f41468s = new e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p201l3.a f41469t = new f();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final p201l3.a f41470u = new g();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final p201l3.a f41471v = new h();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final p201l3.a f41472w = new i();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final p201l3.a f41473x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final p201l3.a f41474y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final p201l3.a f41475z = new c();

    public static final class a extends p201l3.a {
        a() {
            super(10, 11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransaction) {
            Intrinsics.checkNotNullParameter(runInTransaction, "$this$runInTransaction");
            runInTransaction.i0("UPDATE `assets` SET `expected_hash` = NULL");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.m(db2, new p122gd.e());
        }
    }

    public static final class b extends p201l3.a {
        b() {
            super(11, 12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT NOT NULL, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            runInTransactionWithForeignKeysOff.i0("INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count` FROM `updates` WHERE `manifest` IS NOT NULL");
            runInTransactionWithForeignKeysOff.i0("DROP TABLE `updates`");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `new_updates` RENAME TO `updates`");
            runInTransactionWithForeignKeysOff.i0("CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            runInTransactionWithForeignKeysOff.i0("CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new p122gd.f());
        }
    }

    public static final class c extends p201l3.a {
        c() {
            super(12, 13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransaction) {
            Intrinsics.checkNotNullParameter(runInTransaction, "$this$runInTransaction");
            runInTransaction.i0("ALTER TABLE `updates` ADD COLUMN `url` TEXT");
            runInTransaction.i0("ALTER TABLE `updates` ADD COLUMN `headers` TEXT");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.m(db2, new p122gd.g());
        }
    }

    public static final class d extends p201l3.a {
        d() {
            super(4, 5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("CREATE TABLE `new_assets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `key` TEXT, `headers` TEXT, `type` TEXT NOT NULL, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `marked_for_deletion` INTEGER NOT NULL)");
            runInTransactionWithForeignKeysOff.i0("INSERT INTO `new_assets` (`id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion`) SELECT `id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion` FROM `assets`");
            runInTransactionWithForeignKeysOff.i0("DROP TABLE `assets`");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `new_assets` RENAME TO `assets`");
            runInTransactionWithForeignKeysOff.i0("CREATE UNIQUE INDEX `index_assets_key` ON `assets` (`key`)");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new p122gd.h());
        }
    }

    public static final class e extends p201l3.a {
        e() {
            super(5, 6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            runInTransactionWithForeignKeysOff.O0("INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `metadata` AS `manifest`, `status`, `keep`, ?1 AS `last_accessed` FROM `updates`", new Object[]{Long.valueOf(new Date().getTime())});
            runInTransactionWithForeignKeysOff.i0("DROP TABLE `updates`");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `new_updates` RENAME TO `updates`");
            runInTransactionWithForeignKeysOff.i0("CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            runInTransactionWithForeignKeysOff.i0("CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new p122gd.i());
        }
    }

    public static final class f extends p201l3.a {
        f() {
            super(6, 7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("CREATE TABLE IF NOT EXISTS `new_assets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `key` TEXT, `headers` TEXT, `type` TEXT, `metadata` TEXT, `download_time` INTEGER, `relative_path` TEXT, `hash` BLOB, `hash_type` INTEGER NOT NULL, `marked_for_deletion` INTEGER NOT NULL)");
            runInTransactionWithForeignKeysOff.i0("INSERT INTO `new_assets` (`id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion`) SELECT `id`, `url`, `key`, `headers`, `type`, `metadata`, `download_time`, `relative_path`, `hash`, `hash_type`, `marked_for_deletion` FROM `assets`");
            runInTransactionWithForeignKeysOff.i0("DROP TABLE `assets`");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `new_assets` RENAME TO `assets`");
            runInTransactionWithForeignKeysOff.i0("CREATE UNIQUE INDEX `index_assets_key` ON `assets` (`key`)");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new j());
        }
    }

    public static final class g extends p201l3.a {
        g() {
            super(7, 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("CREATE TABLE `new_updates` (`id` BLOB NOT NULL, `scope_key` TEXT NOT NULL, `commit_time` INTEGER NOT NULL, `runtime_version` TEXT NOT NULL, `launch_asset_id` INTEGER, `manifest` TEXT, `status` INTEGER NOT NULL, `keep` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, `successful_launch_count` INTEGER NOT NULL DEFAULT 0, `failed_launch_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`), FOREIGN KEY(`launch_asset_id`) REFERENCES `assets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            runInTransactionWithForeignKeysOff.i0("INSERT INTO `new_updates` (`id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, `successful_launch_count`, `failed_launch_count`) SELECT `id`, `scope_key`, `commit_time`, `runtime_version`, `launch_asset_id`, `manifest`, `status`, `keep`, `last_accessed`, 1 AS `successful_launch_count`, 0 AS `failed_launch_count` FROM `updates`");
            runInTransactionWithForeignKeysOff.i0("DROP TABLE `updates`");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `new_updates` RENAME TO `updates`");
            runInTransactionWithForeignKeysOff.i0("CREATE INDEX `index_updates_launch_asset_id` ON `updates` (`launch_asset_id`)");
            runInTransactionWithForeignKeysOff.i0("CREATE UNIQUE INDEX `index_updates_scope_key_commit_time` ON `updates` (`scope_key`, `commit_time`)");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new k());
        }
    }

    public static final class h extends p201l3.a {
        h() {
            super(8, 9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `assets` ADD COLUMN `extra_request_headers` TEXT");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new l());
        }
    }

    public static final class i extends p201l3.a {
        i() {
            super(9, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(p291q3.g runInTransactionWithForeignKeysOff) {
            Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
            runInTransactionWithForeignKeysOff.i0("ALTER TABLE `assets` ADD COLUMN `expected_hash` TEXT");
            return Unit.f48228a;
        }

        @Override // p201l3.a
        public void a(p291q3.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            UpdatesDatabase.INSTANCE.n(db2, new m());
        }
    }

    /* JADX INFO: renamed from: expo.modules.updates.db.UpdatesDatabase$j, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(p291q3.g gVar, Function1 function1) {
            gVar.a0();
            try {
                function1.invoke(gVar);
                gVar.M0();
            } finally {
                gVar.f1();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(p291q3.g gVar, Function1 function1) {
            try {
                gVar.i0("PRAGMA foreign_keys=OFF");
                m(gVar, function1);
            } finally {
                gVar.i0("PRAGMA foreign_keys=ON");
            }
        }

        public final UpdatesDatabase c(Context context, K k10) {
            UpdatesDatabase updatesDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            UpdatesDatabase updatesDatabase2 = UpdatesDatabase.f41466q;
            if (updatesDatabase2 != null) {
                return updatesDatabase2;
            }
            synchronized (this) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    q.a aVarA = p.a(applicationContext, UpdatesDatabase.class, "updates.db");
                    if (k10 != null) {
                        aVarA.e(AbstractC3311t0.a(k10));
                    }
                    Companion companion = UpdatesDatabase.INSTANCE;
                    updatesDatabase = (UpdatesDatabase) aVarA.a(companion.g(), companion.h(), companion.i(), companion.j(), companion.k(), companion.l(), companion.d(), companion.e(), companion.f()).b().d().c();
                    UpdatesDatabase.f41466q = updatesDatabase;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return updatesDatabase;
        }

        public final p201l3.a d() {
            return UpdatesDatabase.f41473x;
        }

        public final p201l3.a e() {
            return UpdatesDatabase.f41474y;
        }

        public final p201l3.a f() {
            return UpdatesDatabase.f41475z;
        }

        public final p201l3.a g() {
            return UpdatesDatabase.f41467r;
        }

        public final p201l3.a h() {
            return UpdatesDatabase.f41468s;
        }

        public final p201l3.a i() {
            return UpdatesDatabase.f41469t;
        }

        public final p201l3.a j() {
            return UpdatesDatabase.f41470u;
        }

        public final p201l3.a k() {
            return UpdatesDatabase.f41471v;
        }

        public final p201l3.a l() {
            return UpdatesDatabase.f41472w;
        }
    }

    public abstract p140hd.a M();

    public abstract p140hd.c N();

    public abstract p140hd.e O();
}
