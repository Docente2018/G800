towers = [[],[],[]]

counter = -1

def set_towers(rings_number = 3):
    for tower in range(len(towers)):
        for ring in range(rings_number):
            if tower == 0:
                towers[tower].append(ring+1)
            else:
                towers[tower].append(0)


def print_tower():
    global counter
    counter+=1
    for ring in range(len(towers[0])):
        for tower in range(len(towers)):
            print(' ', end='')
            print(towers[tower][ring], end=' ')
        print()
    print('=========')
    print("Step:" + str(counter))
    print('\n'*2)


def get_tower_position(tower = []):
    for ring in tower:
        if ring != 0:
            return tower.index(ring)-1
    return len(tower)-1

def move_ring(src, dest):
    for ring in towers[src]:
        if ring != 0:
            blank_dest = get_tower_position(towers[dest])
            index_ring = towers[src].index(ring)

            towers[dest][blank_dest] = ring
            towers[src][index_ring] = 0
            break


def move( n, src, dest, temp ):
    if n >= 1:
        move( n - 1, src, temp, dest )
        print( "Move %d -> %d" % (src, dest))
        move_ring(src, dest)
        print_tower()
        move( n - 1, temp, dest, src )


def run_hannoi(rings = 3):
    set_towers(rings)
    print(towers, '\n')
    print_tower()
    move(rings, 0, 1, 2)


def main_menu():

  flag = True
  
  while (flag):
    try:
      aros = int(input('\nPor favor seleccione el número de aros: '))
      flag = False
    except ValueError:
      print('\nSolo puede ingresar números\n')
  
  run_hannoi(3)

main_menu()
