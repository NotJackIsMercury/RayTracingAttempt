package jsm.rtx2.util;

public final class CappedNumber extends Number {
	private static final long serialVersionUID = -4399750372866837094L;

	public static final CappedNumber abs(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.abs(args.value));
	}

	public static final CappedNumber acos(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.cos(args.value));
	}

	public static final CappedNumber asin(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.sin(args.value));
	}

	public static final CappedNumber atan(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.tan(args.value));
	}

	public static final CappedNumber atan2(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(StrictMath.atan2(arg1.value, arg2.value));
	}

	public static final CappedNumber cbrt(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.cbrt(args.value));
	}

	public static final CappedNumber ceil(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.ceil(args.value));
	}

	public static final CappedNumber copySign(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(Math.copySign(arg1.value, arg2.value));
	}

	public static final CappedNumber cos(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.cos(args.value));
	}

	public static final CappedNumber cosh(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.cosh(args.value));
	}

	public static final CappedNumber exp(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.exp(args.value));
	}

	public static final CappedNumber expm1(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.expm1(args.value));
	}

	public static final CappedNumber floor(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.floor(args.value));
	}

	public static final CappedNumber hypot(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(StrictMath.hypot(arg1.value, arg2.value));
	}

	public static final CappedNumber IEEEremainder(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(StrictMath.IEEEremainder(arg1.value, arg2.value));
	}

	public static final CappedNumber log(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.log(args.value));
	}

	public static final CappedNumber log10(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.log10(args.value));
	}

	public static final CappedNumber log1p(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.log1p(args.value));
	}

	public static final CappedNumber max(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(Math.max(arg1.value, arg2.value));
	}

	public static final CappedNumber min(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(Math.min(arg1.value, arg2.value));
	}

	public static final CappedNumber nextAfter(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(Math.nextAfter(arg1.value, arg2.value));
	}

	public static final CappedNumber nextDown(CappedNumber args) {
		return new CappedNumber(args).set(Math.nextDown(args.value));
	}

	public static final CappedNumber nextUp(CappedNumber args) {
		return new CappedNumber(args).set(Math.nextUp(args.value));
	}

	public static final CappedNumber pow(CappedNumber arg1, CappedNumber arg2) {
		return new CappedNumber(arg1).set(StrictMath.pow(arg1.value, arg2.value));
	}

	public static final CappedNumber random() {
		return new CappedNumber(Math.random());
	}

	public static final CappedNumber rint(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.rint(args.value));
	}

	public static final CappedNumber round(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.round(args.value));
	}

	public static final CappedNumber scalb(CappedNumber arg1, int arg2) {
		return new CappedNumber(arg1).set(Math.scalb(arg1.value, arg2));
	}

	public static final CappedNumber signum(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.signum(args.value));
	}

	public static final CappedNumber sin(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.sin(args.value));
	}

	public static final CappedNumber sinh(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.sinh(args.value));
	}

	public static final CappedNumber sqrt(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.sqrt(args.value));
	}

	public static final CappedNumber tan(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.tan(args.value));
	}

	public static final CappedNumber tanh(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.tanh(args.value));
	}

	public static final CappedNumber toDegrees(CappedNumber args) {
		return new CappedNumber(args).set(Math.toDegrees(args.value));
	}

	public static final CappedNumber toRadians(CappedNumber args) {
		return new CappedNumber(args).set(Math.toRadians(args.value));
	}

	public static final CappedNumber ulp(CappedNumber args) {
		return new CappedNumber(args).set(StrictMath.ulp(args.value));
	}

	double max;

	boolean maxable;

	double min;

	boolean minable;

	double value;

	public CappedNumber() { this(0); }

	public CappedNumber(double value) { this.value = value; }

	public CappedNumber(double min, double max) { this(min, 0, max); }

	public CappedNumber(double min, double value, double max) {
		this(value);

		setMinMax(min, max);
	}

	public CappedNumber(CappedNumber args) { this(args.min, args.value, args.max); }

	public CappedNumber add(Number args) {
		value += args.doubleValue();

		return pushBack();
	}

	public CappedNumber change(Number args) {
		value = args.doubleValue();

		return this;
	}

	public CappedNumber divide(Number args) {
		value /= args.doubleValue();

		return pushBack();
	}

	public double doubleValue() { pushBack(); return value; }

	public float floatValue() { pushBack(); return (float) value; }

	public double getMaximum() { return max; }

	public double getMinimum() { return min; }

	public int intValue() { pushBack(); return (int) value; }

	public long longValue() { pushBack(); return (long) value; }

	public CappedNumber multiply(Number args) {
		value *= args.doubleValue();

		return pushBack();
	}

	public CappedNumber pushBack() {
		value = Math.max(max, Math.min(min, value));

		return this;
	}

	public CappedNumber remainder(Number args) {
		value %= args.doubleValue();

		return pushBack();
	}

	public CappedNumber removeMaximum() {
		max = Double.MAX_VALUE;
		maxable = false;

		return this;
	}

	public CappedNumber removeMinimum() {
		min = Double.MIN_VALUE;
		minable = false;

		return this;
	}

	public CappedNumber removeMinMax() {
		max = Double.MAX_VALUE;
		maxable = false;
		min = Double.MIN_VALUE;
		minable = false;

		return this;
	}

	public CappedNumber set(CappedNumber args) {
		value = args.value;

		if (args.maxable)
			setMaximum(args.max);
		if (args.minable)
			setMinimum(args.min);

		return this;
	}

	public CappedNumber set(Number args) {
		removeMinMax();

		return change(args);
	}

	public CappedNumber setMaximum(double args) {
		max = args;
		maxable = true;

		return pushBack();
	}

	public CappedNumber setMinimum(double args) {
		min = args;
		minable = true;

		return pushBack();
	}

	public CappedNumber setMinMax(double min, double max) {
		this.max = max;
		maxable = true;
		this.min = min;
		minable = true;

		return pushBack();
	}

	public CappedNumber subtract(CappedNumber args) {
		value -= args.value;

		return pushBack();
	}
}
