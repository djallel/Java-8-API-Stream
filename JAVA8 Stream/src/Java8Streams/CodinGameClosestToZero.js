function closestToZero(ts) {
    if (ts.length === 0) return 0;
    var newTs = ts.map((e) => Math.abs(e));
    var closest = Math.min.apply(null, newTs);
    if (ts.indexOf(closest) >= 0) {
        return closest;
    }
    return (0 - closest);
}