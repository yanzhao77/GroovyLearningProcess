package groovy

import groovy.cli.picocli.CliBuilder

import java.util.concurrent.TimeUnit
import static java.util.concurrent.TimeUnit.DAYS
import static java.util.concurrent.TimeUnit.HOURS

def cli = new CliBuilder()
cli.D(args: 2,   valueSeparator: '=', 'the old way')
cli.X(type: Map, 'the new way')

def options = cli.parse('-Da=b -Dc=d -Xx=y -Xi=j -ZDAYS=2 -ZHOURS=23'.split())
assert options.Ds == ['a', 'b', 'c', 'd']
assert options.Xs == [ 'x':'y', 'i':'j' ]
