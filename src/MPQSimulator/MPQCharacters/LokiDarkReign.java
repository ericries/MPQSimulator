package MPQSimulator.MPQCharacters;

import java.util.ArrayList;
import java.util.List;

import MPQSimulator.Abilities.Ability;
import MPQSimulator.Abilities.AbilityComponent;
import MPQSimulator.Abilities.SwapTileAbilityComponent;

public class LokiDarkReign extends MPQCharacter{

  @Override
  protected List<Ability> initAbility1() {
    
    return null;
  }

  // Illusions
  @Override
  protected List<Ability> initAbility2() {
    List<Ability> abilityList = new ArrayList<>();
    int[] tilesSwappedByLevel = {14, 18, 22, 26, 32};
    // Just swap tiles around.
    for (int i : tilesSwappedByLevel) {
      AbilityComponent swapTiles = new SwapTileAbilityComponent(
          i, AbilityComponent.ALL_COLORS_NO_TEAMUPS_LIST, AbilityComponent.ALL_COLORS_NO_TEAMUPS_LIST);
      
      Ability ability = new Ability();
      ability.addComponent(swapTiles);
      abilityList.add(ability);
    }
    
    return abilityList;
  }

  @Override
  protected List<Ability> initAbility3() {
    return null;
  }  
  
}
